package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bu")
public final class class70 implements Runnable {

    @ObfuscatedName("bu.i")
    public OutputStream field1280;

    @ObfuscatedName("bu.v")
    public InputStream field1279;

    @ObfuscatedName("bu.m")
    public Socket field1283;

    @ObfuscatedName("bu.j")
    public boolean field1286 = false;

    @ObfuscatedName("bu.o")
    public class74 field1282;

    @ObfuscatedName("bu.l")
    public class79 field1285;

    @ObfuscatedName("bu.g")
    public byte[] field1284;

    @ObfuscatedName("bu.w")
    public int field1281 = 0;

    @ObfuscatedName("bu.c")
    public int field1278 = 0;

    @ObfuscatedName("bu.z")
    public boolean field1287 = false;

    public class70(Socket arg0, class74 arg1) throws IOException {
        this.field1282 = arg1;
        this.field1283 = arg0;
        this.field1283.setSoTimeout(30000);
        this.field1283.setTcpNoDelay(true);
        this.field1279 = this.field1283.getInputStream();
        this.field1280 = this.field1283.getOutputStream();
    }

    @ObfuscatedName("bu.m(B)V")
    public void method1406() {
        if (this.field1286) {
            return;
        }
        synchronized (this) {
            this.field1286 = true;
            this.notifyAll();
        }
        if (this.field1285 != null) {
            while (this.field1285.field1415 == 0) {
                class126.method1440(1L);
            }
            if (this.field1285.field1415 == 1) {
                try {
                    ((Thread) this.field1285.field1410).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1285 = null;
    }

    public void finalize() {
        this.method1406();
    }

    @ObfuscatedName("bu.j(B)I")
    public int method1424() throws IOException {
        return this.field1286 ? 0 : this.field1279.read();
    }

    @ObfuscatedName("bu.o(B)I")
    public int method1409() throws IOException {
        return this.field1286 ? 0 : this.field1279.available();
    }

    @ObfuscatedName("bu.l([BIII)V")
    public void method1410(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1286) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1279.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("bu.g([BIIB)V")
    public void method1411(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1286) {
            return;
        }
        if (this.field1287) {
            this.field1287 = false;
            throw new IOException();
        }
        if (this.field1284 == null) {
            this.field1284 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1284[this.field1278] = arg0[arg1 + var5];
                this.field1278 = (this.field1278 + 1) % 5000;
                if ((this.field1281 + 4900) % 5000 == this.field1278) {
                    throw new IOException();
                }
            }
            if (this.field1285 == null) {
                this.field1285 = this.field1282.method1525(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field1281 == this.field1278) {
                            if (this.field1286) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1281;
                        if (this.field1278 >= this.field1281) {
                            var4 = this.field1278 - this.field1281;
                        } else {
                            var4 = 5000 - this.field1281;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1280.write(this.field1284, var3, var4);
                    } catch (IOException var12) {
                        this.field1287 = true;
                    }
                    this.field1281 = (this.field1281 + var4) % 5000;
                    try {
                        if (this.field1281 == this.field1278) {
                            this.field1280.flush();
                        }
                    } catch (IOException var11) {
                        this.field1287 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1279 != null) {
                        this.field1279.close();
                    }
                    if (this.field1280 != null) {
                        this.field1280.close();
                    }
                    if (this.field1283 != null) {
                        this.field1283.close();
                    }
                } catch (IOException var10) {
                }
                this.field1284 = null;
                break;
            }
        } catch (Exception var15) {
            class80.method562((String) null, var15);
        }
    }
}
