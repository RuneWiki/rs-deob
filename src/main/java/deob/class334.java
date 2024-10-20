package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("la")
public final class class334 {

    @ObfuscatedName("la.f")
    public static byte[] field3881 = new byte[520];

    @ObfuscatedName("la.e")
    public class369 field3878 = null;

    @ObfuscatedName("la.v")
    public class369 field3879 = null;

    @ObfuscatedName("la.y")
    public int field3877;

    @ObfuscatedName("la.j")
    public int field3880 = 65000;

    public class334(int arg0, class369 arg1, class369 arg2, int arg3) {
        this.field3877 = arg0;
        this.field3878 = arg1;
        this.field3879 = arg2;
        this.field3880 = arg3;
    }

    @ObfuscatedName("la.f(II)[B")
    public byte[] method5321(int arg0) {
        class369 var2 = this.field3878;
        synchronized (this.field3878) {
            Object var10000;
            try {
                if (this.field3879.method5749() < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field3879.method5758((long) (arg0 * 6));
                this.field3879.method5752(field3881, 0, 6);
                int var3 = (field3881[2] & 0xFF) + ((field3881[0] & 0xFF) << 16) + ((field3881[1] & 0xFF) << 8);
                int var4 = (field3881[5] & 0xFF) + ((field3881[3] & 0xFF) << 16) + ((field3881[4] & 0xFF) << 8);
                if (var3 < 0 || var3 > this.field3880) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var4 > 0 && (long) var4 <= this.field3878.method5749() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;
                    int var7 = 0;
                    while (var6 < var3) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field3878.method5758((long) var4 * 520L);
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
                            this.field3878.method5752(field3881, 0, var8 + var9);
                            var10 = (field3881[3] & 0xFF) + ((field3881[2] & 0xFF) << 8) + ((field3881[0] & 0xFF) << 24) + ((field3881[1] & 0xFF) << 16);
                            var11 = ((field3881[4] & 0xFF) << 8) + (field3881[5] & 0xFF);
                            var12 = (field3881[8] & 0xFF) + ((field3881[7] & 0xFF) << 8) + ((field3881[6] & 0xFF) << 16);
                            var13 = field3881[9] & 0xFF;
                        } else {
                            if (var8 > 512) {
                                var8 = 512;
                            }
                            var9 = 8;
                            this.field3878.method5752(field3881, 0, var8 + var9);
                            var10 = ((field3881[0] & 0xFF) << 8) + (field3881[1] & 0xFF);
                            var11 = ((field3881[2] & 0xFF) << 8) + (field3881[3] & 0xFF);
                            var12 = (field3881[6] & 0xFF) + ((field3881[4] & 0xFF) << 16) + ((field3881[5] & 0xFF) << 8);
                            var13 = field3881[7] & 0xFF;
                        }
                        if (arg0 == var10 && var7 == var11 && this.field3877 == var13) {
                            if (var12 >= 0 && (long) var12 <= this.field3878.method5749() / 520L) {
                                int var14 = var8 + var9;
                                for (int var15 = var9; var15 < var14; var15++) {
                                    var5[var6++] = field3881[var15];
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

    @ObfuscatedName("la.e(I[BII)Z")
    public boolean method5322(int arg0, byte[] arg1, int arg2) {
        class369 var4 = this.field3878;
        synchronized (this.field3878) {
            if (arg2 < 0 || arg2 > this.field3880) {
                throw new IllegalArgumentException("" + this.field3877 + ',' + arg0 + ',' + arg2);
            }
            boolean var5 = this.method5323(arg0, arg1, arg2, true);
            if (!var5) {
                var5 = this.method5323(arg0, arg1, arg2, false);
            }
            return var5;
        }
    }

    @ObfuscatedName("la.v(I[BIZB)Z")
    public boolean method5323(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class369 var5 = this.field3878;
        synchronized (this.field3878) {
            try {
                int var6;
                boolean var10000;
                if (arg3) {
                    if (this.field3879.method5749() < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field3879.method5758((long) (arg0 * 6));
                    this.field3879.method5752(field3881, 0, 6);
                    var6 = (field3881[5] & 0xFF) + ((field3881[4] & 0xFF) << 8) + ((field3881[3] & 0xFF) << 16);
                    if (var6 <= 0 || (long) var6 > this.field3878.method5749() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.field3878.method5749() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }
                field3881[0] = (byte) (arg2 >> 16);
                field3881[1] = (byte) (arg2 >> 8);
                field3881[2] = (byte) arg2;
                field3881[3] = (byte) (var6 >> 16);
                field3881[4] = (byte) (var6 >> 8);
                field3881[5] = (byte) var6;
                this.field3879.method5758((long) (arg0 * 6));
                this.field3879.method5751(field3881, 0, 6);
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    if (var7 < arg2) {
                        label154: {
                            int var9 = 0;
                            if (arg3) {
                                this.field3878.method5758((long) var6 * 520L);
                                int var11;
                                int var12;
                                int var13;
                                if (arg0 > 65535) {
                                    try {
                                        this.field3878.method5752(field3881, 0, 10);
                                    } catch (EOFException var20) {
                                        break label154;
                                    }
                                    var11 = (field3881[3] & 0xFF) + ((field3881[2] & 0xFF) << 8) + ((field3881[1] & 0xFF) << 16) + ((field3881[0] & 0xFF) << 24);
                                    var12 = ((field3881[4] & 0xFF) << 8) + (field3881[5] & 0xFF);
                                    var9 = (field3881[8] & 0xFF) + ((field3881[6] & 0xFF) << 16) + ((field3881[7] & 0xFF) << 8);
                                    var13 = field3881[9] & 0xFF;
                                } else {
                                    try {
                                        this.field3878.method5752(field3881, 0, 8);
                                    } catch (EOFException var19) {
                                        break label154;
                                    }
                                    var11 = ((field3881[0] & 0xFF) << 8) + (field3881[1] & 0xFF);
                                    var12 = ((field3881[2] & 0xFF) << 8) + (field3881[3] & 0xFF);
                                    var9 = (field3881[6] & 0xFF) + ((field3881[4] & 0xFF) << 16) + ((field3881[5] & 0xFF) << 8);
                                    var13 = field3881[7] & 0xFF;
                                }
                                if (arg0 != var11 || var8 != var12 || this.field3877 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var9 < 0 || (long) var9 > this.field3878.method5749() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var9 == 0) {
                                arg3 = false;
                                var9 = (int) ((this.field3878.method5749() + 519L) / 520L);
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
                                field3881[0] = (byte) (arg0 >> 24);
                                field3881[1] = (byte) (arg0 >> 16);
                                field3881[2] = (byte) (arg0 >> 8);
                                field3881[3] = (byte) arg0;
                                field3881[4] = (byte) (var8 >> 8);
                                field3881[5] = (byte) var8;
                                field3881[6] = (byte) (var9 >> 16);
                                field3881[7] = (byte) (var9 >> 8);
                                field3881[8] = (byte) var9;
                                field3881[9] = (byte) this.field3877;
                                this.field3878.method5758((long) var6 * 520L);
                                this.field3878.method5751(field3881, 0, 10);
                                int var15 = arg2 - var7;
                                if (var15 > 510) {
                                    var15 = 510;
                                }
                                this.field3878.method5751(arg1, var7, var15);
                                var7 += var15;
                            } else {
                                if (arg2 - var7 <= 512) {
                                    var9 = 0;
                                }
                                field3881[0] = (byte) (arg0 >> 8);
                                field3881[1] = (byte) arg0;
                                field3881[2] = (byte) (var8 >> 8);
                                field3881[3] = (byte) var8;
                                field3881[4] = (byte) (var9 >> 16);
                                field3881[5] = (byte) (var9 >> 8);
                                field3881[6] = (byte) var9;
                                field3881[7] = (byte) this.field3877;
                                this.field3878.method5758((long) var6 * 520L);
                                this.field3878.method5751(field3881, 0, 8);
                                int var16 = arg2 - var7;
                                if (var16 > 512) {
                                    var16 = 512;
                                }
                                this.field3878.method5751(arg1, var7, var16);
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
        return "" + this.field3877;
    }
}
