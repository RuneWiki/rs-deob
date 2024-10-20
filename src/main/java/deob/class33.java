package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ar")
public final class class33 {

    @ObfuscatedName("ar.q")
    public static byte[] field368 = new byte[520];

    @ObfuscatedName("ar.l")
    public class14 field369 = null;

    @ObfuscatedName("ar.a")
    public class14 field370 = null;

    @ObfuscatedName("ar.o")
    public int field371;

    @ObfuscatedName("ar.c")
    public int field372 = 65000;

    public class33(int arg0, class14 arg1, class14 arg2, int arg3) {
        this.field371 = arg0;
        this.field369 = arg1;
        this.field370 = arg2;
        this.field372 = arg3;
    }

    @ObfuscatedName("ar.q(II)[B")
    public byte[] method387(int arg0) {
        class14 var2 = this.field369;
        synchronized (this.field369) {
            Object var10000;
            try {
                if (this.field370.method128() < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field370.method127((long) (arg0 * 6));
                this.field370.method147(field368, 0, 6);
                int var3 = (field368[2] & 0xFF) + ((field368[1] & 0xFF) << 8) + ((field368[0] & 0xFF) << 16);
                int var4 = (field368[5] & 0xFF) + ((field368[3] & 0xFF) << 16) + ((field368[4] & 0xFF) << 8);
                if (var3 < 0 || var3 > this.field372) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var4 > 0 && (long) var4 <= this.field369.method128() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;
                    int var7 = 0;
                    while (var6 < var3) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field369.method127((long) (var4 * 520));
                        int var8 = var3 - var6;
                        if (var8 > 512) {
                            var8 = 512;
                        }
                        this.field369.method147(field368, 0, var8 + 8);
                        int var9 = ((field368[0] & 0xFF) << 8) + (field368[1] & 0xFF);
                        int var10 = ((field368[2] & 0xFF) << 8) + (field368[3] & 0xFF);
                        int var11 = (field368[6] & 0xFF) + ((field368[5] & 0xFF) << 8) + ((field368[4] & 0xFF) << 16);
                        int var12 = field368[7] & 0xFF;
                        if (arg0 != var9 || var7 != var10 || this.field371 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (long) var11 > this.field369.method128() / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var13 = 0; var13 < var8; var13++) {
                            var5[var6++] = field368[var13 + 8];
                        }
                        var4 = var11;
                        var7++;
                    }
                    byte[] var18 = var5;
                    return var18;
                }
                var10000 = null;
            } catch (IOException var16) {
                return null;
            }
            return (byte[]) var10000;
        }
    }

    @ObfuscatedName("ar.l(I[BII)Z")
    public boolean method388(int arg0, byte[] arg1, int arg2) {
        class14 var4 = this.field369;
        synchronized (this.field369) {
            if (arg2 < 0 || arg2 > this.field372) {
                throw new IllegalArgumentException();
            }
            boolean var5 = this.method389(arg0, arg1, arg2, true);
            if (!var5) {
                var5 = this.method389(arg0, arg1, arg2, false);
            }
            return var5;
        }
    }

    @ObfuscatedName("ar.a(I[BIZI)Z")
    public boolean method389(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class14 var5 = this.field369;
        synchronized (this.field369) {
            try {
                int var6;
                boolean var10000;
                if (arg3) {
                    if (this.field370.method128() < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field370.method127((long) (arg0 * 6));
                    this.field370.method147(field368, 0, 6);
                    var6 = (field368[5] & 0xFF) + ((field368[4] & 0xFF) << 8) + ((field368[3] & 0xFF) << 16);
                    if (var6 <= 0 || (long) var6 > this.field369.method128() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.field369.method128() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }
                field368[0] = (byte) (arg2 >> 16);
                field368[1] = (byte) (arg2 >> 8);
                field368[2] = (byte) arg2;
                field368[3] = (byte) (var6 >> 16);
                field368[4] = (byte) (var6 >> 8);
                field368[5] = (byte) var6;
                this.field370.method127((long) (arg0 * 6));
                this.field370.method132(field368, 0, 6);
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    if (var7 < arg2) {
                        label129: {
                            int var9 = 0;
                            if (arg3) {
                                this.field369.method127((long) (var6 * 520));
                                try {
                                    this.field369.method147(field368, 0, 8);
                                } catch (EOFException var17) {
                                    break label129;
                                }
                                int var11 = ((field368[0] & 0xFF) << 8) + (field368[1] & 0xFF);
                                int var12 = ((field368[2] & 0xFF) << 8) + (field368[3] & 0xFF);
                                var9 = (field368[6] & 0xFF) + ((field368[5] & 0xFF) << 8) + ((field368[4] & 0xFF) << 16);
                                int var13 = field368[7] & 0xFF;
                                if (arg0 != var11 || var8 != var12 || this.field371 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var9 < 0 || (long) var9 > this.field369.method128() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var9 == 0) {
                                arg3 = false;
                                var9 = (int) ((this.field369.method128() + 519L) / 520L);
                                if (var9 == 0) {
                                    var9++;
                                }
                                if (var6 == var9) {
                                    var9++;
                                }
                            }
                            if (arg2 - var7 <= 512) {
                                var9 = 0;
                            }
                            field368[0] = (byte) (arg0 >> 8);
                            field368[1] = (byte) arg0;
                            field368[2] = (byte) (var8 >> 8);
                            field368[3] = (byte) var8;
                            field368[4] = (byte) (var9 >> 16);
                            field368[5] = (byte) (var9 >> 8);
                            field368[6] = (byte) var9;
                            field368[7] = (byte) this.field371;
                            this.field369.method127((long) (var6 * 520));
                            this.field369.method132(field368, 0, 8);
                            int var14 = arg2 - var7;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field369.method132(arg1, var7, var14);
                            var7 += var14;
                            var6 = var9;
                            var8++;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var18) {
                return false;
            }
        }
    }
}
