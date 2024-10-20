package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ie")
public class class236 extends class234 {

    @ObfuscatedName("ie.j")
    public class308 field3133;

    @ObfuscatedName("ie.d")
    public class308 field3139;

    @ObfuscatedName("ie.l")
    public int field3129;

    @ObfuscatedName("ie.k")
    public volatile boolean field3132 = false;

    @ObfuscatedName("ie.ac")
    public boolean field3130 = false;

    @ObfuscatedName("ie.az")
    public volatile boolean[] field3134;

    @ObfuscatedName("ie.aw")
    public static CRC32 field3131 = new CRC32();

    @ObfuscatedName("ie.aa")
    public int field3136;

    @ObfuscatedName("ie.ap")
    public int field3137;

    @ObfuscatedName("ie.ar")
    public int field3138 = -1;

    public class236(class308 arg0, class308 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3133 = arg0;
        this.field3139 = arg1;
        this.field3129 = arg2;
        this.field3130 = arg5;
        int var8 = this.field3129;
        if (Statics.field277 == null) {
            class237.method286((class236) null, 255, 255, 0, (byte) 0, true);
            class237.field3160[var8] = this;
        } else {
            Statics.field277.field3702 = var8 * 8 + 5;
            int var9 = Statics.field277.method5085();
            int var10 = Statics.field277.method5085();
            this.method3846(var9, var10);
        }
    }

    @ObfuscatedName("ie.dr(I)Z")
    public boolean method3845() {
        return this.field3132;
    }

    @ObfuscatedName("ie.du(I)I")
    public int method3847() {
        if (this.field3132) {
            return 100;
        } else if (this.field3116 == null) {
            int var1 = this.field3129;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field331 != null && Statics.field331.field2094 == var2) {
                var4 = Statics.field1865.field3702 * 99 / (Statics.field1865.field3699.length - Statics.field331.field3103) + 1;
            } else {
                var4 = 0;
            }
            int var5 = var4;
            if (var4 >= 100) {
                var5 = 99;
            }
            return var5;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ie.n(IB)V")
    public void method3725(int arg0) {
        int var2 = this.field3129;
        long var3 = (long) ((var2 << 16) + arg0);
        class233 var5 = (class233) class237.field3156.method5393(var3);
        if (var5 != null) {
            class237.field3148.method4354(var5);
        }
    }

    @ObfuscatedName("ie.o(II)V")
    public void method3799(int arg0) {
        if (this.field3133 == null || this.field3134 == null || !this.field3134[arg0]) {
            class237.method286(this, this.field3129, arg0, this.field3108[arg0], (byte) 2, true);
        } else {
            class235.method365(arg0, this.field3133, this);
        }
    }

    @ObfuscatedName("ie.ds(III)V")
    public void method3846(int arg0, int arg1) {
        this.field3136 = arg0;
        this.field3137 = arg1;
        if (this.field3139 == null) {
            class237.method286(this, 255, this.field3129, this.field3136, (byte) 0, true);
        } else {
            class235.method365(this.field3129, this.field3139, this);
        }
    }

    @ObfuscatedName("ie.dc(I[BZZI)V")
    public void method3869(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3132) {
                throw new RuntimeException();
            }
            if (this.field3139 != null) {
                class235.method3217(this.field3129, arg1, this.field3139);
            }
            this.method3724(arg1);
            this.method3867();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3110[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3110[arg0];
        if (this.field3133 != null) {
            class235.method3217(arg0, arg1, this.field3133);
            this.field3134[arg0] = true;
        }
        if (arg3) {
            this.field3116[arg0] = class206.method62(arg1, false);
        }
    }

    @ObfuscatedName("ie.di(Lkg;I[BZB)V")
    public void method3859(class308 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3139 != arg0) {
            if (!arg3 && this.field3138 == arg1) {
                this.field3132 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3134[arg1] = false;
                if (this.field3130 || arg3) {
                    class237.method286(this, this.field3129, arg1, this.field3108[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3131.reset();
            field3131.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3131.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3108[arg1] != var9 || this.field3110[arg1] != var10) {
                this.field3134[arg1] = false;
                if (this.field3130 || arg3) {
                    class237.method286(this, this.field3129, arg1, this.field3108[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3134[arg1] = true;
            if (arg3) {
                this.field3116[arg1] = class206.method62(arg2, false);
            }
            return;
        }
        if (this.field3132) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class237.method286(this, 255, this.field3129, this.field3136, (byte) 0, true);
            return;
        }
        field3131.reset();
        field3131.update(arg2, 0, arg2.length);
        int var5 = (int) field3131.getValue();
        if (this.field3136 != var5) {
            class237.method286(this, 255, this.field3129, this.field3136, (byte) 0, true);
            return;
        }
        class300 var6 = new class300(class234.method3504(arg2));
        int var7 = var6.method4990();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3129 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method5085();
        }
        if (this.field3137 != var8) {
            class237.method286(this, 255, this.field3129, this.field3136, (byte) 0, true);
            return;
        }
        this.method3724(arg2);
        this.method3867();
    }

    @ObfuscatedName("ie.dk(B)V")
    public void method3867() {
        this.field3134 = new boolean[this.field3116.length];
        for (int var1 = 0; var1 < this.field3134.length; var1++) {
            this.field3134[var1] = false;
        }
        if (this.field3133 == null) {
            this.field3132 = true;
            return;
        }
        this.field3138 = -1;
        for (int var2 = 0; var2 < this.field3134.length; var2++) {
            if (this.field3117[var2] > 0) {
                class308 var3 = this.field3133;
                class232 var5 = new class232();
                var5.field3101 = 1;
                var5.field2094 = (long) var2;
                var5.field3098 = var3;
                var5.field3096 = this;
                class262 var6 = class235.field3127;
                synchronized (class235.field3127) {
                    class235.field3127.method4433(var5);
                }
                Object var8 = class235.field3125;
                synchronized (class235.field3125) {
                    if (class235.field3128 == 0) {
                        Statics.field1965 = new Thread(new class235());
                        Statics.field1965.setDaemon(true);
                        Statics.field1965.start();
                        Statics.field1965.setPriority(5);
                    }
                    class235.field3128 = 600;
                }
                this.field3138 = var2;
            }
        }
        if (this.field3138 == -1) {
            this.field3132 = true;
        }
    }

    @ObfuscatedName("ie.y(II)I")
    public int method3746(int arg0) {
        if (this.field3116[arg0] != null) {
            return 100;
        } else if (this.field3134[arg0]) {
            return 100;
        } else {
            int var2 = this.field3129;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field331 != null && Statics.field331.field2094 == var3) {
                var5 = Statics.field1865.field3702 * 99 / (Statics.field1865.field3699.length - Statics.field331.field3103) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ie.dx(II)Z")
    public boolean method3849(int arg0) {
        return this.field3134[arg0];
    }

    @ObfuscatedName("ie.dz(II)Z")
    public boolean method3850(int arg0) {
        return this.method3748(arg0) != null;
    }

    @ObfuscatedName("ie.do(I)I")
    public int method3851() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3116.length; var3++) {
            if (this.field3117[var3] > 0) {
                var1 += 100;
                var2 += this.method3746(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
