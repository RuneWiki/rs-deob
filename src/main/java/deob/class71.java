package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("bl")
public final class class71 {

    @ObfuscatedName("bl.g")
    public static byte[] field1292 = new byte[520];

    @ObfuscatedName("bl.m")
    public class30 field1285 = null;

    @ObfuscatedName("bl.v")
    public class30 field1286 = null;

    @ObfuscatedName("bl.r")
    public int field1287;

    @ObfuscatedName("bl.n")
    public int field1290 = 65000;

    public class71(int arg0, class30 arg1, class30 arg2, int arg3) {
        this.field1287 = arg0;
        this.field1285 = arg1;
        this.field1286 = arg2;
        this.field1290 = arg3;
    }

    @ObfuscatedName("bl.g(II)[B")
    public byte[] method1421(int arg0) {
        class30 var2 = this.field1285;
        synchronized (this.field1285) {
            Object var10000;
            try {
                if (this.field1286.method566() < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field1286.method568((long) (arg0 * 6));
                this.field1286.method571(field1292, 0, 6);
                int var3 = (field1292[2] & 0xFF) + ((field1292[1] & 0xFF) << 8) + ((field1292[0] & 0xFF) << 16);
                int var4 = (field1292[5] & 0xFF) + ((field1292[4] & 0xFF) << 8) + ((field1292[3] & 0xFF) << 16);
                if (var3 < 0 || var3 > this.field1290) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var4 > 0 && (long) var4 <= this.field1285.method566() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;
                    int var7 = 0;
                    while (var6 < var3) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field1285.method568((long) (var4 * 520));
                        int var8 = var3 - var6;
                        if (var8 > 512) {
                            var8 = 512;
                        }
                        this.field1285.method571(field1292, 0, var8 + 8);
                        int var9 = ((field1292[0] & 0xFF) << 8) + (field1292[1] & 0xFF);
                        int var10 = ((field1292[2] & 0xFF) << 8) + (field1292[3] & 0xFF);
                        int var11 = (field1292[6] & 0xFF) + ((field1292[5] & 0xFF) << 8) + ((field1292[4] & 0xFF) << 16);
                        int var12 = field1292[7] & 0xFF;
                        if (arg0 != var9 || var7 != var10 || this.field1287 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (long) var11 > this.field1285.method566() / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var13 = 0; var13 < var8; var13++) {
                            var5[var6++] = field1292[var13 + 8];
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

    @ObfuscatedName("bl.m(I[BII)Z")
    public boolean method1411(int arg0, byte[] arg1, int arg2) {
        class30 var4 = this.field1285;
        synchronized (this.field1285) {
            if (arg2 < 0 || arg2 > this.field1290) {
                throw new IllegalArgumentException();
            }
            boolean var5 = this.method1414(arg0, arg1, arg2, true);
            if (!var5) {
                var5 = this.method1414(arg0, arg1, arg2, false);
            }
            return var5;
        }
    }

    @ObfuscatedName("bl.v(I[BIZI)Z")
    public boolean method1414(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class30 var5 = this.field1285;
        synchronized (this.field1285) {
            try {
                int var6;
                boolean var10000;
                if (arg3) {
                    if (this.field1286.method566() < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field1286.method568((long) (arg0 * 6));
                    this.field1286.method571(field1292, 0, 6);
                    var6 = (field1292[5] & 0xFF) + ((field1292[4] & 0xFF) << 8) + ((field1292[3] & 0xFF) << 16);
                    if (var6 <= 0 || (long) var6 > this.field1285.method566() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.field1285.method566() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }
                field1292[0] = (byte) (arg2 >> 16);
                field1292[1] = (byte) (arg2 >> 8);
                field1292[2] = (byte) arg2;
                field1292[3] = (byte) (var6 >> 16);
                field1292[4] = (byte) (var6 >> 8);
                field1292[5] = (byte) var6;
                this.field1286.method568((long) (arg0 * 6));
                this.field1286.method574(field1292, 0, 6);
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    if (var7 < arg2) {
                        label129: {
                            int var9 = 0;
                            if (arg3) {
                                this.field1285.method568((long) (var6 * 520));
                                try {
                                    this.field1285.method571(field1292, 0, 8);
                                } catch (EOFException var17) {
                                    break label129;
                                }
                                int var11 = ((field1292[0] & 0xFF) << 8) + (field1292[1] & 0xFF);
                                int var12 = ((field1292[2] & 0xFF) << 8) + (field1292[3] & 0xFF);
                                var9 = (field1292[6] & 0xFF) + ((field1292[4] & 0xFF) << 16) + ((field1292[5] & 0xFF) << 8);
                                int var13 = field1292[7] & 0xFF;
                                if (arg0 != var11 || var8 != var12 || this.field1287 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var9 < 0 || (long) var9 > this.field1285.method566() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var9 == 0) {
                                arg3 = false;
                                var9 = (int) ((this.field1285.method566() + 519L) / 520L);
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
                            field1292[0] = (byte) (arg0 >> 8);
                            field1292[1] = (byte) arg0;
                            field1292[2] = (byte) (var8 >> 8);
                            field1292[3] = (byte) var8;
                            field1292[4] = (byte) (var9 >> 16);
                            field1292[5] = (byte) (var9 >> 8);
                            field1292[6] = (byte) var9;
                            field1292[7] = (byte) this.field1287;
                            this.field1285.method568((long) (var6 * 520));
                            this.field1285.method574(field1292, 0, 8);
                            int var14 = arg2 - var7;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field1285.method574(arg1, var7, var14);
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
