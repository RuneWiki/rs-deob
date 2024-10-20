package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("bd")
public final class class70 {

    @ObfuscatedName("bd.j")
    public static byte[] field1288 = new byte[520];

    @ObfuscatedName("bd.y")
    public class29 field1286 = null;

    @ObfuscatedName("bd.x")
    public class29 field1278 = null;

    @ObfuscatedName("bd.z")
    public int field1279;

    @ObfuscatedName("bd.c")
    public int field1280 = 65000;

    public class70(int arg0, class29 arg1, class29 arg2, int arg3) {
        this.field1279 = arg0;
        this.field1286 = arg1;
        this.field1278 = arg2;
        this.field1280 = arg3;
    }

    @ObfuscatedName("bd.j(IS)[B")
    public byte[] method1372(int arg0) {
        class29 var2 = this.field1286;
        synchronized (this.field1286) {
            Object var10000;
            try {
                if (this.field1278.method592() < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field1278.method583((long) (arg0 * 6));
                this.field1278.method571(field1288, 0, 6);
                int var3 = (field1288[2] & 0xFF) + ((field1288[0] & 0xFF) << 16) + ((field1288[1] & 0xFF) << 8);
                int var4 = (field1288[5] & 0xFF) + ((field1288[4] & 0xFF) << 8) + ((field1288[3] & 0xFF) << 16);
                if (var3 < 0 || var3 > this.field1280) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var4 > 0 && (long) var4 <= this.field1286.method592() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;
                    int var7 = 0;
                    while (var6 < var3) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field1286.method583((long) (var4 * 520));
                        int var8 = var3 - var6;
                        if (var8 > 512) {
                            var8 = 512;
                        }
                        this.field1286.method571(field1288, 0, var8 + 8);
                        int var9 = ((field1288[0] & 0xFF) << 8) + (field1288[1] & 0xFF);
                        int var10 = ((field1288[2] & 0xFF) << 8) + (field1288[3] & 0xFF);
                        int var11 = (field1288[6] & 0xFF) + ((field1288[5] & 0xFF) << 8) + ((field1288[4] & 0xFF) << 16);
                        int var12 = field1288[7] & 0xFF;
                        if (arg0 != var9 || var7 != var10 || this.field1279 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (long) var11 > this.field1286.method592() / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var13 = 0; var13 < var8; var13++) {
                            var5[var6++] = field1288[var13 + 8];
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

    @ObfuscatedName("bd.y(I[BII)Z")
    public boolean method1378(int arg0, byte[] arg1, int arg2) {
        class29 var4 = this.field1286;
        synchronized (this.field1286) {
            if (arg2 < 0 || arg2 > this.field1280) {
                throw new IllegalArgumentException();
            }
            boolean var5 = this.method1375(arg0, arg1, arg2, true);
            if (!var5) {
                var5 = this.method1375(arg0, arg1, arg2, false);
            }
            return var5;
        }
    }

    @ObfuscatedName("bd.x(I[BIZI)Z")
    public boolean method1375(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class29 var5 = this.field1286;
        synchronized (this.field1286) {
            try {
                int var6;
                boolean var10000;
                if (arg3) {
                    if (this.field1278.method592() < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field1278.method583((long) (arg0 * 6));
                    this.field1278.method571(field1288, 0, 6);
                    var6 = (field1288[5] & 0xFF) + ((field1288[4] & 0xFF) << 8) + ((field1288[3] & 0xFF) << 16);
                    if (var6 <= 0 || (long) var6 > this.field1286.method592() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.field1286.method592() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }
                field1288[0] = (byte) (arg2 >> 16);
                field1288[1] = (byte) (arg2 >> 8);
                field1288[2] = (byte) arg2;
                field1288[3] = (byte) (var6 >> 16);
                field1288[4] = (byte) (var6 >> 8);
                field1288[5] = (byte) var6;
                this.field1278.method583((long) (arg0 * 6));
                this.field1278.method573(field1288, 0, 6);
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    if (var7 < arg2) {
                        label129: {
                            int var9 = 0;
                            if (arg3) {
                                this.field1286.method583((long) (var6 * 520));
                                try {
                                    this.field1286.method571(field1288, 0, 8);
                                } catch (EOFException var17) {
                                    break label129;
                                }
                                int var11 = ((field1288[0] & 0xFF) << 8) + (field1288[1] & 0xFF);
                                int var12 = ((field1288[2] & 0xFF) << 8) + (field1288[3] & 0xFF);
                                var9 = (field1288[6] & 0xFF) + ((field1288[4] & 0xFF) << 16) + ((field1288[5] & 0xFF) << 8);
                                int var13 = field1288[7] & 0xFF;
                                if (arg0 != var11 || var8 != var12 || this.field1279 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var9 < 0 || (long) var9 > this.field1286.method592() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var9 == 0) {
                                arg3 = false;
                                var9 = (int) ((this.field1286.method592() + 519L) / 520L);
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
                            field1288[0] = (byte) (arg0 >> 8);
                            field1288[1] = (byte) arg0;
                            field1288[2] = (byte) (var8 >> 8);
                            field1288[3] = (byte) var8;
                            field1288[4] = (byte) (var9 >> 16);
                            field1288[5] = (byte) (var9 >> 8);
                            field1288[6] = (byte) var9;
                            field1288[7] = (byte) this.field1279;
                            this.field1286.method583((long) (var6 * 520));
                            this.field1286.method573(field1288, 0, 8);
                            int var14 = arg2 - var7;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field1286.method573(arg1, var7, var14);
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
