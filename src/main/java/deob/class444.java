package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("rg")
public final class class444 {

    @ObfuscatedName("rg.aw")
    public static byte[] field4705 = new byte[520];

    @ObfuscatedName("rg.ay")
    public class497 field4700 = null;

    @ObfuscatedName("rg.ar")
    public class497 field4701 = null;

    @ObfuscatedName("rg.am")
    public int field4702;

    @ObfuscatedName("rg.as")
    public int field4703 = 65000;

    public class444(int arg0, class497 arg1, class497 arg2, int arg3) {
        this.field4702 = arg0;
        this.field4700 = arg1;
        this.field4701 = arg2;
        this.field4703 = arg3;
    }

    @ObfuscatedName("rg.aw(IB)[B")
    public byte[] method7405(int arg0) {
        class497 var2 = this.field4700;
        synchronized (this.field4700) {
            Object var10000;
            try {
                if (this.field4701.method8041() < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field4701.method8047((long) (arg0 * 6));
                this.field4701.method8042(field4705, 0, 6);
                int var3 = (field4705[2] & 0xFF) + ((field4705[0] & 0xFF) << 16) + ((field4705[1] & 0xFF) << 8);
                int var4 = (field4705[5] & 0xFF) + ((field4705[4] & 0xFF) << 8) + ((field4705[3] & 0xFF) << 16);
                if (var3 < 0 || var3 > this.field4703) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var4 > 0 && (long) var4 <= this.field4700.method8041() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;
                    int var7 = 0;
                    while (var6 < var3) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field4700.method8047((long) var4 * 520L);
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
                            this.field4700.method8042(field4705, 0, var8 + var9);
                            var10 = (field4705[3] & 0xFF) + ((field4705[2] & 0xFF) << 8) + ((field4705[0] & 0xFF) << 24) + ((field4705[1] & 0xFF) << 16);
                            var11 = ((field4705[4] & 0xFF) << 8) + (field4705[5] & 0xFF);
                            var12 = (field4705[8] & 0xFF) + ((field4705[7] & 0xFF) << 8) + ((field4705[6] & 0xFF) << 16);
                            var13 = field4705[9] & 0xFF;
                        } else {
                            if (var8 > 512) {
                                var8 = 512;
                            }
                            var9 = 8;
                            this.field4700.method8042(field4705, 0, var8 + var9);
                            var10 = ((field4705[0] & 0xFF) << 8) + (field4705[1] & 0xFF);
                            var11 = ((field4705[2] & 0xFF) << 8) + (field4705[3] & 0xFF);
                            var12 = (field4705[6] & 0xFF) + ((field4705[5] & 0xFF) << 8) + ((field4705[4] & 0xFF) << 16);
                            var13 = field4705[7] & 0xFF;
                        }
                        if (arg0 == var10 && var7 == var11 && this.field4702 == var13) {
                            if (var12 >= 0 && (long) var12 <= this.field4700.method8041() / 520L) {
                                int var14 = var8 + var9;
                                for (int var15 = var9; var15 < var14; var15++) {
                                    var5[var6++] = field4705[var15];
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

    @ObfuscatedName("rg.ay(I[BIB)Z")
    public boolean method7413(int arg0, byte[] arg1, int arg2) {
        class497 var4 = this.field4700;
        synchronized (this.field4700) {
            if (arg2 < 0 || arg2 > this.field4703) {
                throw new IllegalArgumentException("" + this.field4702 + ',' + arg0 + ',' + arg2);
            }
            boolean var5 = this.method7407(arg0, arg1, arg2, true);
            if (!var5) {
                var5 = this.method7407(arg0, arg1, arg2, false);
            }
            return var5;
        }
    }

    @ObfuscatedName("rg.ar(I[BIZS)Z")
    public boolean method7407(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class497 var5 = this.field4700;
        synchronized (this.field4700) {
            try {
                int var6;
                boolean var10000;
                if (arg3) {
                    if (this.field4701.method8041() < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field4701.method8047((long) (arg0 * 6));
                    this.field4701.method8042(field4705, 0, 6);
                    var6 = (field4705[5] & 0xFF) + ((field4705[3] & 0xFF) << 16) + ((field4705[4] & 0xFF) << 8);
                    if (var6 <= 0 || (long) var6 > this.field4700.method8041() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.field4700.method8041() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }
                field4705[0] = (byte) (arg2 >> 16);
                field4705[1] = (byte) (arg2 >> 8);
                field4705[2] = (byte) arg2;
                field4705[3] = (byte) (var6 >> 16);
                field4705[4] = (byte) (var6 >> 8);
                field4705[5] = (byte) var6;
                this.field4701.method8047((long) (arg0 * 6));
                this.field4701.method8061(field4705, 0, 6);
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    if (var7 < arg2) {
                        label154: {
                            int var9 = 0;
                            if (arg3) {
                                this.field4700.method8047((long) var6 * 520L);
                                int var11;
                                int var12;
                                int var13;
                                if (arg0 > 65535) {
                                    try {
                                        this.field4700.method8042(field4705, 0, 10);
                                    } catch (EOFException var20) {
                                        break label154;
                                    }
                                    var11 = (field4705[3] & 0xFF) + ((field4705[2] & 0xFF) << 8) + ((field4705[0] & 0xFF) << 24) + ((field4705[1] & 0xFF) << 16);
                                    var12 = ((field4705[4] & 0xFF) << 8) + (field4705[5] & 0xFF);
                                    var9 = (field4705[8] & 0xFF) + ((field4705[7] & 0xFF) << 8) + ((field4705[6] & 0xFF) << 16);
                                    var13 = field4705[9] & 0xFF;
                                } else {
                                    try {
                                        this.field4700.method8042(field4705, 0, 8);
                                    } catch (EOFException var19) {
                                        break label154;
                                    }
                                    var11 = ((field4705[0] & 0xFF) << 8) + (field4705[1] & 0xFF);
                                    var12 = ((field4705[2] & 0xFF) << 8) + (field4705[3] & 0xFF);
                                    var9 = (field4705[6] & 0xFF) + ((field4705[4] & 0xFF) << 16) + ((field4705[5] & 0xFF) << 8);
                                    var13 = field4705[7] & 0xFF;
                                }
                                if (arg0 != var11 || var8 != var12 || this.field4702 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var9 < 0 || (long) var9 > this.field4700.method8041() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var9 == 0) {
                                arg3 = false;
                                var9 = (int) ((this.field4700.method8041() + 519L) / 520L);
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
                                field4705[0] = (byte) (arg0 >> 24);
                                field4705[1] = (byte) (arg0 >> 16);
                                field4705[2] = (byte) (arg0 >> 8);
                                field4705[3] = (byte) arg0;
                                field4705[4] = (byte) (var8 >> 8);
                                field4705[5] = (byte) var8;
                                field4705[6] = (byte) (var9 >> 16);
                                field4705[7] = (byte) (var9 >> 8);
                                field4705[8] = (byte) var9;
                                field4705[9] = (byte) this.field4702;
                                this.field4700.method8047((long) var6 * 520L);
                                this.field4700.method8061(field4705, 0, 10);
                                int var15 = arg2 - var7;
                                if (var15 > 510) {
                                    var15 = 510;
                                }
                                this.field4700.method8061(arg1, var7, var15);
                                var7 += var15;
                            } else {
                                if (arg2 - var7 <= 512) {
                                    var9 = 0;
                                }
                                field4705[0] = (byte) (arg0 >> 8);
                                field4705[1] = (byte) arg0;
                                field4705[2] = (byte) (var8 >> 8);
                                field4705[3] = (byte) var8;
                                field4705[4] = (byte) (var9 >> 16);
                                field4705[5] = (byte) (var9 >> 8);
                                field4705[6] = (byte) var9;
                                field4705[7] = (byte) this.field4702;
                                this.field4700.method8047((long) var6 * 520L);
                                this.field4700.method8061(field4705, 0, 8);
                                int var16 = arg2 - var7;
                                if (var16 > 512) {
                                    var16 = 512;
                                }
                                this.field4700.method8061(arg1, var7, var16);
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
        return "" + this.field4702;
    }
}
