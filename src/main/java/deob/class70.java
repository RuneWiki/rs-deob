package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("bk")
public final class class70 {

    @ObfuscatedName("bk.u")
    public static byte[] field1284 = new byte[520];

    @ObfuscatedName("bk.k")
    public class29 field1292 = null;

    @ObfuscatedName("bk.x")
    public class29 field1295 = null;

    @ObfuscatedName("bk.m")
    public int field1287;

    @ObfuscatedName("bk.n")
    public int field1288 = 65000;

    public class70(int arg0, class29 arg1, class29 arg2, int arg3) {
        this.field1287 = arg0;
        this.field1292 = arg1;
        this.field1295 = arg2;
        this.field1288 = arg3;
    }

    @ObfuscatedName("bk.u(IS)[B")
    public byte[] method1395(int arg0) {
        class29 var2 = this.field1292;
        synchronized (this.field1292) {
            Object var10000;
            try {
                if (this.field1295.method552() < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field1295.method575((long) (arg0 * 6));
                this.field1295.method555(field1284, 0, 6);
                int var3 = (field1284[2] & 0xFF) + ((field1284[1] & 0xFF) << 8) + ((field1284[0] & 0xFF) << 16);
                int var4 = (field1284[5] & 0xFF) + ((field1284[3] & 0xFF) << 16) + ((field1284[4] & 0xFF) << 8);
                if (var3 < 0 || var3 > this.field1288) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var4 > 0 && (long) var4 <= this.field1292.method552() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;
                    int var7 = 0;
                    while (var6 < var3) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field1292.method575((long) (var4 * 520));
                        int var8 = var3 - var6;
                        if (var8 > 512) {
                            var8 = 512;
                        }
                        this.field1292.method555(field1284, 0, var8 + 8);
                        int var9 = ((field1284[0] & 0xFF) << 8) + (field1284[1] & 0xFF);
                        int var10 = ((field1284[2] & 0xFF) << 8) + (field1284[3] & 0xFF);
                        int var11 = (field1284[6] & 0xFF) + ((field1284[4] & 0xFF) << 16) + ((field1284[5] & 0xFF) << 8);
                        int var12 = field1284[7] & 0xFF;
                        if (arg0 != var9 || var7 != var10 || this.field1287 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (long) var11 > this.field1292.method552() / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var13 = 0; var13 < var8; var13++) {
                            var5[var6++] = field1284[var13 + 8];
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

    @ObfuscatedName("bk.k(I[BII)Z")
    public boolean method1396(int arg0, byte[] arg1, int arg2) {
        class29 var4 = this.field1292;
        synchronized (this.field1292) {
            if (arg2 < 0 || arg2 > this.field1288) {
                throw new IllegalArgumentException();
            }
            boolean var5 = this.method1397(arg0, arg1, arg2, true);
            if (!var5) {
                var5 = this.method1397(arg0, arg1, arg2, false);
            }
            return var5;
        }
    }

    @ObfuscatedName("bk.x(I[BIZB)Z")
    public boolean method1397(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class29 var5 = this.field1292;
        synchronized (this.field1292) {
            try {
                int var6;
                boolean var10000;
                if (arg3) {
                    if (this.field1295.method552() < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field1295.method575((long) (arg0 * 6));
                    this.field1295.method555(field1284, 0, 6);
                    var6 = (field1284[5] & 0xFF) + ((field1284[4] & 0xFF) << 8) + ((field1284[3] & 0xFF) << 16);
                    if (var6 <= 0 || (long) var6 > this.field1292.method552() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.field1292.method552() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }
                field1284[0] = (byte) (arg2 >> 16);
                field1284[1] = (byte) (arg2 >> 8);
                field1284[2] = (byte) arg2;
                field1284[3] = (byte) (var6 >> 16);
                field1284[4] = (byte) (var6 >> 8);
                field1284[5] = (byte) var6;
                this.field1295.method575((long) (arg0 * 6));
                this.field1295.method557(field1284, 0, 6);
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    if (var7 < arg2) {
                        label129: {
                            int var9 = 0;
                            if (arg3) {
                                this.field1292.method575((long) (var6 * 520));
                                try {
                                    this.field1292.method555(field1284, 0, 8);
                                } catch (EOFException var17) {
                                    break label129;
                                }
                                int var11 = ((field1284[0] & 0xFF) << 8) + (field1284[1] & 0xFF);
                                int var12 = ((field1284[2] & 0xFF) << 8) + (field1284[3] & 0xFF);
                                var9 = (field1284[6] & 0xFF) + ((field1284[5] & 0xFF) << 8) + ((field1284[4] & 0xFF) << 16);
                                int var13 = field1284[7] & 0xFF;
                                if (arg0 != var11 || var8 != var12 || this.field1287 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var9 < 0 || (long) var9 > this.field1292.method552() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var9 == 0) {
                                arg3 = false;
                                var9 = (int) ((this.field1292.method552() + 519L) / 520L);
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
                            field1284[0] = (byte) (arg0 >> 8);
                            field1284[1] = (byte) arg0;
                            field1284[2] = (byte) (var8 >> 8);
                            field1284[3] = (byte) var8;
                            field1284[4] = (byte) (var9 >> 16);
                            field1284[5] = (byte) (var9 >> 8);
                            field1284[6] = (byte) var9;
                            field1284[7] = (byte) this.field1287;
                            this.field1292.method575((long) (var6 * 520));
                            this.field1292.method557(field1284, 0, 8);
                            int var14 = arg2 - var7;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field1292.method557(arg1, var7, var14);
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
