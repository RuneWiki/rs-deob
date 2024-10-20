package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("kg")
public final class class308 {

    @ObfuscatedName("kg.f")
    public static byte[] field3777 = new byte[520];

    @ObfuscatedName("kg.i")
    public int field3782;

    @ObfuscatedName("kg.y")
    public class342 field3778 = null;

    @ObfuscatedName("kg.w")
    public class342 field3780 = null;

    @ObfuscatedName("kg.p")
    public int field3781 = 65000;

    public class308(int arg0, class342 arg1, class342 arg2, int arg3) {
        this.field3782 = arg0;
        this.field3778 = arg1;
        this.field3780 = arg2;
        this.field3781 = arg3;
    }

    @ObfuscatedName("kg.f(IB)[B")
    public byte[] method5420(int arg0) {
        class342 var2 = this.field3778;
        synchronized (this.field3778) {
            Object var10000;
            try {
                if (this.field3780.method6072() < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field3780.method6091((long) (arg0 * 6));
                this.field3780.method6074(field3777, 0, 6);
                int var3 = (field3777[2] & 0xFF) + ((field3777[0] & 0xFF) << 16) + ((field3777[1] & 0xFF) << 8);
                int var4 = (field3777[5] & 0xFF) + ((field3777[3] & 0xFF) << 16) + ((field3777[4] & 0xFF) << 8);
                if (var3 < 0 || var3 > this.field3781) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var4 > 0 && (long) var4 <= this.field3778.method6072() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;
                    int var7 = 0;
                    while (var6 < var3) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field3778.method6091((long) var4 * 520L);
                        int var8 = var3 - var6;
                        byte var9;
                        int var10;
                        int var11;
                        int var12;
                        int var13;
                        if (arg0 > 65535) {
                            if (var8 > 510) {
                                var8 = 510;
                            }
                            var9 = 10;
                            this.field3778.method6074(field3777, 0, var8 + var9);
                            var10 = (field3777[3] & 0xFF) + ((field3777[2] & 0xFF) << 8) + ((field3777[1] & 0xFF) << 16) + ((field3777[0] & 0xFF) << 24);
                            var11 = ((field3777[4] & 0xFF) << 8) + (field3777[5] & 0xFF);
                            var12 = (field3777[8] & 0xFF) + ((field3777[6] & 0xFF) << 16) + ((field3777[7] & 0xFF) << 8);
                            var13 = field3777[9] & 0xFF;
                        } else {
                            if (var8 > 512) {
                                var8 = 512;
                            }
                            var9 = 8;
                            this.field3778.method6074(field3777, 0, var8 + var9);
                            var10 = ((field3777[0] & 0xFF) << 8) + (field3777[1] & 0xFF);
                            var11 = ((field3777[2] & 0xFF) << 8) + (field3777[3] & 0xFF);
                            var12 = (field3777[6] & 0xFF) + ((field3777[5] & 0xFF) << 8) + ((field3777[4] & 0xFF) << 16);
                            var13 = field3777[7] & 0xFF;
                        }
                        if (arg0 == var10 && var7 == var11 && this.field3782 == var13) {
                            if (var12 >= 0 && (long) var12 <= this.field3778.method6072() / 520L) {
                                int var14 = var8 + var9;
                                for (int var15 = var9; var15 < var14; var15++) {
                                    var5[var6++] = field3777[var15];
                                }
                                var4 = var12;
                                var7++;
                                continue;
                            }
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var10000 = null;
                        return (byte[]) var10000;
                    }
                    byte[] var20 = var5;
                    return var20;
                }
                var10000 = null;
            } catch (IOException var18) {
                return null;
            }
            return (byte[]) var10000;
        }
    }

    @ObfuscatedName("kg.i(I[BII)Z")
    public boolean method5417(int arg0, byte[] arg1, int arg2) {
        class342 var4 = this.field3778;
        synchronized (this.field3778) {
            if (arg2 < 0 || arg2 > this.field3781) {
                throw new IllegalArgumentException("" + this.field3782 + ',' + arg0 + ',' + arg2);
            }
            boolean var5 = this.method5418(arg0, arg1, arg2, true);
            if (!var5) {
                var5 = this.method5418(arg0, arg1, arg2, false);
            }
            return var5;
        }
    }

    @ObfuscatedName("kg.y(I[BIZI)Z")
    public boolean method5418(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class342 var5 = this.field3778;
        synchronized (this.field3778) {
            try {
                int var6;
                boolean var10000;
                if (arg3) {
                    if (this.field3780.method6072() < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field3780.method6091((long) (arg0 * 6));
                    this.field3780.method6074(field3777, 0, 6);
                    var6 = (field3777[5] & 0xFF) + ((field3777[3] & 0xFF) << 16) + ((field3777[4] & 0xFF) << 8);
                    if (var6 <= 0 || (long) var6 > this.field3778.method6072() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.field3778.method6072() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }
                field3777[0] = (byte) (arg2 >> 16);
                field3777[1] = (byte) (arg2 >> 8);
                field3777[2] = (byte) arg2;
                field3777[3] = (byte) (var6 >> 16);
                field3777[4] = (byte) (var6 >> 8);
                field3777[5] = (byte) var6;
                this.field3780.method6091((long) (arg0 * 6));
                this.field3780.method6076(field3777, 0, 6);
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    if (var7 < arg2) {
                        label154: {
                            int var9 = 0;
                            if (arg3) {
                                this.field3778.method6091((long) var6 * 520L);
                                int var11;
                                int var12;
                                int var13;
                                if (arg0 > 65535) {
                                    try {
                                        this.field3778.method6074(field3777, 0, 10);
                                    } catch (EOFException var20) {
                                        break label154;
                                    }
                                    var11 = (field3777[3] & 0xFF) + ((field3777[2] & 0xFF) << 8) + ((field3777[1] & 0xFF) << 16) + ((field3777[0] & 0xFF) << 24);
                                    var12 = ((field3777[4] & 0xFF) << 8) + (field3777[5] & 0xFF);
                                    var9 = (field3777[8] & 0xFF) + ((field3777[7] & 0xFF) << 8) + ((field3777[6] & 0xFF) << 16);
                                    var13 = field3777[9] & 0xFF;
                                } else {
                                    try {
                                        this.field3778.method6074(field3777, 0, 8);
                                    } catch (EOFException var19) {
                                        break label154;
                                    }
                                    var11 = ((field3777[0] & 0xFF) << 8) + (field3777[1] & 0xFF);
                                    var12 = ((field3777[2] & 0xFF) << 8) + (field3777[3] & 0xFF);
                                    var9 = (field3777[6] & 0xFF) + ((field3777[5] & 0xFF) << 8) + ((field3777[4] & 0xFF) << 16);
                                    var13 = field3777[7] & 0xFF;
                                }
                                if (arg0 != var11 || var8 != var12 || this.field3782 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var9 < 0 || (long) var9 > this.field3778.method6072() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var9 == 0) {
                                arg3 = false;
                                var9 = (int) ((this.field3778.method6072() + 519L) / 520L);
                                if (var9 == 0) {
                                    var9++;
                                }
                                if (var6 == var9) {
                                    var9++;
                                }
                            }
                            if (arg0 > 65535) {
                                if (arg2 - var7 <= 510) {
                                    var9 = 0;
                                }
                                field3777[0] = (byte) (arg0 >> 24);
                                field3777[1] = (byte) (arg0 >> 16);
                                field3777[2] = (byte) (arg0 >> 8);
                                field3777[3] = (byte) arg0;
                                field3777[4] = (byte) (var8 >> 8);
                                field3777[5] = (byte) var8;
                                field3777[6] = (byte) (var9 >> 16);
                                field3777[7] = (byte) (var9 >> 8);
                                field3777[8] = (byte) var9;
                                field3777[9] = (byte) this.field3782;
                                this.field3778.method6091((long) var6 * 520L);
                                this.field3778.method6076(field3777, 0, 10);
                                int var15 = arg2 - var7;
                                if (var15 > 510) {
                                    var15 = 510;
                                }
                                this.field3778.method6076(arg1, var7, var15);
                                var7 += var15;
                            } else {
                                if (arg2 - var7 <= 512) {
                                    var9 = 0;
                                }
                                field3777[0] = (byte) (arg0 >> 8);
                                field3777[1] = (byte) arg0;
                                field3777[2] = (byte) (var8 >> 8);
                                field3777[3] = (byte) var8;
                                field3777[4] = (byte) (var9 >> 16);
                                field3777[5] = (byte) (var9 >> 8);
                                field3777[6] = (byte) var9;
                                field3777[7] = (byte) this.field3782;
                                this.field3778.method6091((long) var6 * 520L);
                                this.field3778.method6076(field3777, 0, 8);
                                int var16 = arg2 - var7;
                                if (var16 > 512) {
                                    var16 = 512;
                                }
                                this.field3778.method6076(arg1, var7, var16);
                                var7 += var16;
                            }
                            var6 = var9;
                            var8++;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var21) {
                return false;
            }
        }
    }

    public String toString() {
        return "" + this.field3782;
    }
}
