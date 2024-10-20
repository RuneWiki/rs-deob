package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("sl")
public final class class491 {

    @ObfuscatedName("sl.ap")
    public static byte[] field5081 = new byte[520];

    @ObfuscatedName("sl.aw")
    public class538 field5078 = null;

    @ObfuscatedName("sl.ak")
    public class538 field5079 = null;

    @ObfuscatedName("sl.aj")
    public int field5077;

    @ObfuscatedName("sl.ai")
    public int field5080 = 65000;

    public class491(int arg0, class538 arg1, class538 arg2, int arg3) {
        this.field5077 = arg0;
        this.field5078 = arg1;
        this.field5079 = arg2;
        this.field5080 = arg3;
    }

    @ObfuscatedName("sl.ap(II)[B")
    public byte[] method8554(int arg0) {
        class538 var2 = this.field5078;
        synchronized (this.field5078) {
            Object var10000;
            try {
                if (this.field5079.method9050() < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field5079.method9062((long) (arg0 * 6));
                this.field5079.method9049(field5081, 0, 6);
                int var3 = (field5081[2] & 0xFF) + ((field5081[0] & 0xFF) << 16) + ((field5081[1] & 0xFF) << 8);
                int var4 = (field5081[5] & 0xFF) + ((field5081[3] & 0xFF) << 16) + ((field5081[4] & 0xFF) << 8);
                if (var3 < 0 || var3 > this.field5080) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var4 > 0 && (long) var4 <= this.field5078.method9050() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;
                    int var7 = 0;
                    while (var6 < var3) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field5078.method9062((long) var4 * 520L);
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
                            this.field5078.method9049(field5081, 0, var8 + var9);
                            var10 = (field5081[3] & 0xFF) + ((field5081[2] & 0xFF) << 8) + ((field5081[1] & 0xFF) << 16) + ((field5081[0] & 0xFF) << 24);
                            var11 = ((field5081[4] & 0xFF) << 8) + (field5081[5] & 0xFF);
                            var12 = (field5081[8] & 0xFF) + ((field5081[7] & 0xFF) << 8) + ((field5081[6] & 0xFF) << 16);
                            var13 = field5081[9] & 0xFF;
                        } else {
                            if (var8 > 512) {
                                var8 = 512;
                            }
                            var9 = 8;
                            this.field5078.method9049(field5081, 0, var8 + var9);
                            var10 = ((field5081[0] & 0xFF) << 8) + (field5081[1] & 0xFF);
                            var11 = ((field5081[2] & 0xFF) << 8) + (field5081[3] & 0xFF);
                            var12 = (field5081[6] & 0xFF) + ((field5081[5] & 0xFF) << 8) + ((field5081[4] & 0xFF) << 16);
                            var13 = field5081[7] & 0xFF;
                        }
                        if (arg0 == var10 && var7 == var11 && this.field5077 == var13) {
                            if (var12 >= 0 && (long) var12 <= this.field5078.method9050() / 520L) {
                                int var14 = var8 + var9;
                                for (int var15 = var9; var15 < var14; var15++) {
                                    var5[var6++] = field5081[var15];
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

    @ObfuscatedName("sl.aw(I[BII)Z")
    public boolean method8545(int arg0, byte[] arg1, int arg2) {
        class538 var4 = this.field5078;
        synchronized (this.field5078) {
            if (arg2 < 0 || arg2 > this.field5080) {
                throw new IllegalArgumentException("" + this.field5077 + ',' + arg0 + ',' + arg2);
            }
            boolean var5 = this.method8547(arg0, arg1, arg2, true);
            if (!var5) {
                var5 = this.method8547(arg0, arg1, arg2, false);
            }
            return var5;
        }
    }

    @ObfuscatedName("sl.ak(I[BIZI)Z")
    public boolean method8547(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class538 var5 = this.field5078;
        synchronized (this.field5078) {
            try {
                int var6;
                boolean var10000;
                if (arg3) {
                    if (this.field5079.method9050() < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field5079.method9062((long) (arg0 * 6));
                    this.field5079.method9049(field5081, 0, 6);
                    var6 = (field5081[5] & 0xFF) + ((field5081[3] & 0xFF) << 16) + ((field5081[4] & 0xFF) << 8);
                    if (var6 <= 0 || (long) var6 > this.field5078.method9050() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.field5078.method9050() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }
                field5081[0] = (byte) (arg2 >> 16);
                field5081[1] = (byte) (arg2 >> 8);
                field5081[2] = (byte) arg2;
                field5081[3] = (byte) (var6 >> 16);
                field5081[4] = (byte) (var6 >> 8);
                field5081[5] = (byte) var6;
                this.field5079.method9062((long) (arg0 * 6));
                this.field5079.method9054(field5081, 0, 6);
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    if (var7 < arg2) {
                        label154: {
                            int var9 = 0;
                            if (arg3) {
                                this.field5078.method9062((long) var6 * 520L);
                                int var11;
                                int var12;
                                int var13;
                                if (arg0 > 65535) {
                                    try {
                                        this.field5078.method9049(field5081, 0, 10);
                                    } catch (EOFException var20) {
                                        break label154;
                                    }
                                    var11 = (field5081[3] & 0xFF) + ((field5081[2] & 0xFF) << 8) + ((field5081[0] & 0xFF) << 24) + ((field5081[1] & 0xFF) << 16);
                                    var12 = ((field5081[4] & 0xFF) << 8) + (field5081[5] & 0xFF);
                                    var9 = (field5081[8] & 0xFF) + ((field5081[7] & 0xFF) << 8) + ((field5081[6] & 0xFF) << 16);
                                    var13 = field5081[9] & 0xFF;
                                } else {
                                    try {
                                        this.field5078.method9049(field5081, 0, 8);
                                    } catch (EOFException var19) {
                                        break label154;
                                    }
                                    var11 = ((field5081[0] & 0xFF) << 8) + (field5081[1] & 0xFF);
                                    var12 = ((field5081[2] & 0xFF) << 8) + (field5081[3] & 0xFF);
                                    var9 = (field5081[6] & 0xFF) + ((field5081[5] & 0xFF) << 8) + ((field5081[4] & 0xFF) << 16);
                                    var13 = field5081[7] & 0xFF;
                                }
                                if (arg0 != var11 || var8 != var12 || this.field5077 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var9 < 0 || (long) var9 > this.field5078.method9050() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var9 == 0) {
                                arg3 = false;
                                var9 = (int) ((this.field5078.method9050() + 519L) / 520L);
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
                                field5081[0] = (byte) (arg0 >> 24);
                                field5081[1] = (byte) (arg0 >> 16);
                                field5081[2] = (byte) (arg0 >> 8);
                                field5081[3] = (byte) arg0;
                                field5081[4] = (byte) (var8 >> 8);
                                field5081[5] = (byte) var8;
                                field5081[6] = (byte) (var9 >> 16);
                                field5081[7] = (byte) (var9 >> 8);
                                field5081[8] = (byte) var9;
                                field5081[9] = (byte) this.field5077;
                                this.field5078.method9062((long) var6 * 520L);
                                this.field5078.method9054(field5081, 0, 10);
                                int var15 = arg2 - var7;
                                if (var15 > 510) {
                                    var15 = 510;
                                }
                                this.field5078.method9054(arg1, var7, var15);
                                var7 += var15;
                            } else {
                                if (arg2 - var7 <= 512) {
                                    var9 = 0;
                                }
                                field5081[0] = (byte) (arg0 >> 8);
                                field5081[1] = (byte) arg0;
                                field5081[2] = (byte) (var8 >> 8);
                                field5081[3] = (byte) var8;
                                field5081[4] = (byte) (var9 >> 16);
                                field5081[5] = (byte) (var9 >> 8);
                                field5081[6] = (byte) var9;
                                field5081[7] = (byte) this.field5077;
                                this.field5078.method9062((long) var6 * 520L);
                                this.field5078.method9054(field5081, 0, 8);
                                int var16 = arg2 - var7;
                                if (var16 > 512) {
                                    var16 = 512;
                                }
                                this.field5078.method9054(arg1, var7, var16);
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
        return "" + this.field5077;
    }
}
